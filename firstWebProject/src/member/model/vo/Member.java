package member.model.vo;

import java.sql.Date;

//USERID	VARCHAR2(15 BYTE)
//USERPWD	VARCHAR2(15 BYTE)
//USERNAME	VARCHAR2(20 BYTE)
//GENDER	CHAR(1 BYTE)
//AGE	NUMBER(3,0)
//PHONE	VARCHAR2(13 BYTE)
//EMAIL	VARCHAR2(30 BYTE)
//HOBBY	VARCHAR2(100 BYTE)
//ETC	VARCHAR2(1000 BYTE)
//ENROLL_DATE	DATE
//LASTMODIFIED	DATE
public class Member implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6233268739315942899L;
	
	private String userid;
	private String userpwd;
	private String username;
	private String gender;
	private int age;
	private String phone;
	private String email;
	private String hobby;
	private String etc;
	private Date enrollDate;
	private Date lastModified;
	
	public Member() {
	}

	public Member(String userid, String userpwd, String username, String gender, int age, String phone, String email,
			String hobby, String etc, Date enrollDate, Date lastModified) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.hobby = hobby;
		this.etc = etc;
		this.enrollDate = enrollDate;
		this.lastModified = lastModified;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return userid + ", " + userpwd + ", " + username + ", " + gender + ", " + age + ", " + phone + ", " + email
				+ ", " + hobby + ", " + etc + ", " + enrollDate + ", " + lastModified;
	}
	
	
	
	
	
	
}
