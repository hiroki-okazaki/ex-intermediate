package com.example.domain;


/**
 * チーム情報を表すクラス.
 * @author hirokiokazaki
 */
public class Team {

	/**
	 * チームID.
	 */
	private Integer id;
	/**
	 * リーグネーム.
	 */
	private String leagueName;
	/**
	 * チームネーム.
	 */
	private String teamName;
	/**
	 * 本拠地.
	 */
	private String headquarters;
	/**
	 * 創設日.
	 */
	private String inanguration;
	/**
	 * チーム変遷.
	 */
	private String history;
	
	
	@Override
	public String toString() {
		return "team [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquarters="
				+ headquarters + ", inanguration=" + inanguration + ", history=" + history + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getInanguration() {
		return inanguration;
	}
	public void setInanguration(String inanguration) {
		this.inanguration = inanguration;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
}
