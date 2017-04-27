
public class Preference {
	private int quietTime;
	private int music;
	private int reading;
	private int chatting;


	public Preference(int quietTime, int music, int reading, int chatting){
		if(music >=1 && music <=10){
			this.music = music;
		}
		if(quietTime >=1 && quietTime <=10){
			this.quietTime = quietTime;
		}
		if(reading >=1 && reading <=10){
			this.reading = reading;
		}
		if(chatting >=1 && chatting <=10){
			this.chatting = chatting;
		}
	}
	public int getQuietTime(){
		return quietTime;
	}
	public int getMusic(){
		return music;
	}
	public int getReading(){
		return reading;
	}
	public int getChatting(){
		return chatting;
	}
	public int compare(Preference pref){
		int difference = Math.abs((this.quietTime + this.music + 
				this.reading + this.chatting) - (pref.quietTime + 
						pref.music + pref.reading + pref.chatting) );
		return difference;
		
	}
}
