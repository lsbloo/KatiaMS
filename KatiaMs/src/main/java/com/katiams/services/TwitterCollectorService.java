package com.katiams.services;

import javax.transaction.Transactional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.katiams.repositories.TwitterCollectorRepository;

@Service
@Transactional
public class TwitterCollectorService {
	
	/**
	 * twitterCollectorRepository
	 */
	private final TwitterCollectorRepository twitterCollectorRepository;
	
	
	/**
	 * Default Constructor ServiceTwitter;
	 * @param twitterCollectorRepository
	 */
	public TwitterCollectorService(TwitterCollectorRepository twitterCollectorRepository) {
		this.twitterCollectorRepository=twitterCollectorRepository;
	}
	
	
	
	

}
