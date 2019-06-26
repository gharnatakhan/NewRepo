package com.fdmgroup.model;

public class Comment {
	
	private int commentId;
	private int userId;
	private String message;
	private Comment comment;
	
	public Comment(int commentId, int userId, String message, Comment comment) {
		this.commentId = commentId;
		this.userId = userId;
		this.message = message;
		this.comment = comment;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", userId=" + userId + ", message=" + message + ", comment="
				+ comment + "]";
	}

}
