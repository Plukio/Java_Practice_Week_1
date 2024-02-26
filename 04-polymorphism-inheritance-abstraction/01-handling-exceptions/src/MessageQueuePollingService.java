public class MessageQueuePollingService {

    private final MessageQueue messageQueue;

    MessageQueuePollingService(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void connectAndPoll()  {
        try {
            messageQueue.connect();
            try {
                messageQueue.pollMessage();
            } catch (MessageQueueConnectionException e) {
                System.out.println("message queue is not available:" + e);
            } catch (MessageQueueRuntimeException e) {
                System.out.println("message poll fails:" + e);
            } finally {
                messageQueue.disconnect();
            }
        } catch (MessageQueueConnectionException e){
            System.out.println("message queue is not available:" + e);
        }

    }

}
