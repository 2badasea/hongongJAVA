package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

}
