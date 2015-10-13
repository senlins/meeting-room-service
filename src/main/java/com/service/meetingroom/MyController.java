package com.service.meetingroom;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private MeetingRoomService mrs = new MeetingRoomService();

	@RequestMapping("/meetingRooms")
	public List<MeetingRoom> getMeetingRooms() {
		return mrs.getMeetingRooms();
	}
}
