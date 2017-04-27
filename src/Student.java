
public class Student {
	private String name;
	private char gender;
	private Date birthDay;
	private	Preference pref;
	private boolean matched;

	
	public Student(String name, char gender , Preference pref, Date birthDay) {
		this.name = name;
		this.gender = gender;
		this.pref = pref; 
		this.birthDay = birthDay;
	}
	public void setName (String name){
		this.name =name;
	}
	public String getName(){
		return name;
	}

	public void setGender(char gender){
		
		this.gender = gender;
	
	}
	public char getGender(){
		
		return gender;
	}
	
	public void setBirthDay(Date birthDay){
		this.birthDay = birthDay;
	}
	
	public Date getBirthDay(){
		return birthDay;
	}
	
	public void setPref(Preference pref){
		
		this.pref = pref;
	}
	public Preference getPref(){
		 return pref;

	}
	public void setMatched(boolean matched){
		this.matched = matched;
	}
	public boolean getmatched(){
		return matched;
	}
	public int compare(Student st){ 
		if(this.getGender() != st.getGender()){
			return 0;
		}
		return (40 - pref.compare(st.getPref())) + (60 - birthDay.compare(st.getBirthDay()));

	
		
	}
	
}
