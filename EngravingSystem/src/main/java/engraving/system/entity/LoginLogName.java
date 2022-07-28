package engraving.system.entity;

import javax.persistence.*;

@Entity

@Table(name = "loginlog")
public class LoginLogName {

	// ログインID
	@Id
	@Column(name = "login_id")
	private int loginId;

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	// 社員番号
	@Column(name = "employeeId")
	private String employeeId;

	public void setEmployeeId(String string) {
		this.employeeId = string;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	// ログイン日時
	@Column(name = "login_time")
	private String loginTime;

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	// name
	@Column(length = 100, nullable = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
