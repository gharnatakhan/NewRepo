package com.fdmgroup.service;

import com.fdmgroup.model.Application;
import com.fdmgroup.model.Comment;

public interface CommentServiceI {
	Comment createComment(Application app, String comment);
	
	Comment modifyComment(Comment c);
	
	boolean removeComment(Comment c);
	
	Comment replyToComment(Comment replyTo, String c);
}
