package excepiton.ex0;

public class NetWorkServiceV0 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV0 client = new NetworkClientV0(address);

		client.connect();
		client.send(data);
		client.disconnect();
	}
}
