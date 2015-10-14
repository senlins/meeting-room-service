package com.service.meetingroom;

import java.sql.Date;
import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private MeetingRoomService mrs = new MeetingRoomService();

	@RequestMapping("/meetingRooms")
	public Collection<MeetingRoom> getMeetingRooms() {
		return mrs.getMeetingRooms();
	}
	
	@RequestMapping("/meetingRooms/available")
	public Collection<MeetingRoom> getAvailableMeetingRooms(@RequestParam long fromDateLong, @RequestParam long toDateLong) {
		Date fromDate = new Date(fromDateLong);
		Date toDate = new Date(toDateLong);
		return mrs.getAvailableMeetingRooms(fromDate, toDate);
	}
	
	@RequestMapping("/meetingRooms/{id}")
	public MeetingRoom getMeetingRoomById(@PathVariable int id) {
		return mrs.getMeetingRoomById(id);
	}
	
}
