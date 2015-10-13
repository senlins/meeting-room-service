package com.service.meetingroom;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomDao {
	public List<MeetingRoom> getMeetingRooms() {
		List<MeetingRoom> meetingRooms = new ArrayList<>();
		MeetingRoom m1 = new MeetingRoom(1, "Paradise");
		MeetingRoom m2 = new MeetingRoom(2, "SH");
		meetingRooms.add(m1);
		meetingRooms.add(m2);

		return meetingRooms;
	}
	
}
