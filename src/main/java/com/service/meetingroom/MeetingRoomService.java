package com.service.meetingroom;

import java.util.List;

public class MeetingRoomService {
	private MeetingRoomDao mrd = new MeetingRoomDao();
	
	public List<MeetingRoom> getMeetingRooms() {
		return mrd.getMeetingRooms();
	}
}
