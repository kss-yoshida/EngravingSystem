package engraving.system.entity;

import javax.persistence.*;

@Entity
@Table(name="attendanceinfo")
public class Attendance {
	
	//勤怠ID
	@Id
	private int attendanceId;
	
	public int getAttendanseId() {
		return attendanceId;
	}
	
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	
	//社員番号
	@Column(nullable = false)
	private int employeeId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	//日付
	@Column(nullable = false)
	private String day;
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	//出勤時間
	@Column(nullable = false)
	private String startTime;
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	//退勤時間
	@Column(nullable = false)
	private String finishTime;
	
	public String getFinishTime() {
		return finishTime;
	}
	
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	
	//出勤時打刻時間
	@Column(nullable = false)
	private String startEngrave;
	
	public String getStartEngrove() {
		return startEngrave;
	}
	
	public void setStartEngrove(String startEngrave) {
		this.startEngrave = startEngrave;
	}
	
	//退勤時打刻時間
	@Column(nullable = false)
	private String finishEngrave;
	
	public String getFinishEngrave() {
		return finishEngrave;
	}
	
	public void setFinishEngrave(String finishEngrave) {
		this.finishEngrave = finishEngrave;
	}
	
	//休憩時間
	@Column(nullable = false)
	private String breakTime;
	
	public String getBreakTime() {
		return breakTime;
	}
	
	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
	
	//残業時間
	@Column(nullable = false)
	private String overTime;
	
	public String getOverTime() {
		return overTime;
	}
	
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
}