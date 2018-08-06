package com.ThinkTower.Controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ThinkTower.dto.ThinkTower;



@RestController
@RequestMapping("/Thinktower")
public class ThinkTowerController {
List<ThinkTower> thinkTowerList = new ArrayList<>();
@RequestMapping(method = RequestMethod.POST, value="/sendMessage")
public ResponseEntity sendMessage(@RequestBody ThinkTower thinktower) {

	if(thinktower.getMessage().length()>= 249 || thinktower.getMessage().matches("^(0|[1-9][0-9]*)$")) {
		return (ResponseEntity) ResponseEntity.status(400).build();
	}
		ThinkTower thinktowerdto = new ThinkTower();
		thinktowerdto.setMessage(thinktower.getMessage());
		thinkTowerList.add(thinktowerdto);
	
	return (ResponseEntity) ResponseEntity.status(200).build();
	
	
}
@RequestMapping(method = RequestMethod.GET, value="/getMessage")
public List<ThinkTower> getMessage() {
	Collections.reverse(thinkTowerList);

	return thinkTowerList;
	
}
}
