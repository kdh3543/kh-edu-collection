package classes;

// 정보은닉 규칙
// 접근제한자
// public, private, protected, default

public class Tv {
	
	private int channel; // 아래 channel과 메모리 영역이 다름(Heap)
	private int volume;
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}