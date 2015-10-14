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

	@RequestMapping("/meetingRooms_figaro")
	public Collection<MeetingRoom_Figaro> getMeetingRooms() {
		return mrs.getMeetingRooms();
	}
	
	@RequestMapping("/meetingRooms_figaro/available")
	public Collection<MeetingRoom_Figaro> getAvailableMeetingRooms(@RequestParam long fromDateLong_figaro, @RequestParam long toDateLong_figaro) {
		Date fromDate = new Date(fromDateLong_figaro);
		Date toDate = new Date(toDateLong_figaro);
		return mrs.getAvailableMeetingRooms(fromDate, toDate);
	}
	
	@RequestMapping("/meetingRooms_figaro/{id}")
	public MeetingRoom_Figaro getMeetingRoomById(@PathVariable int id_figaro) {
		return mrs.getMeetingRoomById(id_figaro);
	}
	
}
