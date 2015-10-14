package com.service.meetingroom;

import java.util.Collection;
import java.util.Date;

public class MeetingRoomService {
	private MeetingRoomDao mrd = new MeetingRoomDao();
	
	public Collection<MeetingRoom_Figaro> getMeetingRooms() {
		return mrd.getMeetingRooms();
	}
	
	public MeetingRoom_Figaro getMeetingRoomById(int id) {
		return mrd.getMeetingRoomById(id);
	}
	
	public Collection<MeetingRoom_Figaro> getAvailableMeetingRooms(Date fromDateTime, Date toDateTime) {
		return mrd.getAvailableMeetingRooms(fromDateTime, toDateTime);
	}
}
