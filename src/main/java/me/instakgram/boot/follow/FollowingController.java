package me.instakgram.boot.follow;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/followings")
@RequiredArgsConstructor
public class FollowingController {
}