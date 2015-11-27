import java.util.Date;

public class Shift {

	int shiftID;
	Date Start;
	Date End;
	CleaningSchedule Schedule;

	public Shift(int id, Date start, Date end, CleaningSchedule schedule) {
		this.shiftID = id;
		this.Start = start;
		this.End = end;
		this.Schedule = schedule;

	}

	public Date changeDateTime(Date time) {
		// this.time=time;

		return time; // is this needed?

	}

	public void getCleaningScheduleID() {

	}

	public void addEmployee() {

	}
}
