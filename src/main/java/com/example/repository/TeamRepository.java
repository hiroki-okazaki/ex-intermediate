package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Team;


@Repository
public class TeamRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Team> TEAM_ROW_MAPPER = (rs, i) -> {
		Team team = new Team();
		team.setId(rs.getInt("id"));
		team.setLeagueName(rs.getString("league_name"));
		team.setTeamName(rs.getString("team_name"));
		team.setHeadquarters(rs.getString("headquarters"));
		team.setInanguration(rs.getString("inauguration"));
		team.setHistory(rs.getString("history"));
		return team;
	};

	/**
	 * 全チームの情報を取得.
	 * @return チーム情報
	 */
	public List<Team> findAll() {
		String sql = "SELECT  id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY inauguration";
		List<Team> team = template.query(sql, TEAM_ROW_MAPPER);

		return team;
	}
	
	
	/**
	 * 指定したチーム情報を取得.
	 * @param id 主キー
	 * @return チーム情報.
	 */
	public Team load(Integer id) {
		String sql = "select id,league_name,team_name,headquarters,inauguration,history FROM teams where id = :id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		Team team = template.queryForObject(sql, param, TEAM_ROW_MAPPER);

		return team;
	}

}
