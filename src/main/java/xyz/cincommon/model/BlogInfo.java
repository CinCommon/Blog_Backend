package xyz.cincommon.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.Data;
@Data
public class BlogInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7603963245270216317L;

	private Integer id;

	private Integer uid;
	
	private String title;

	private String content;
	
	private String introduction;

	private Integer clickRates;

	private Integer replyAmount;

	private Date createDate;

	private String createUser;
	
	private Date updateDate;
	
	private String updateUser;
	
	private String status;
	
	private Set<TagInfo> tagInfoSet;
	
	private ForumInfo forumInfo;
	
}
