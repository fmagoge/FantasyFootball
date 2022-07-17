package com.fmagoge.fantasyfootball.entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userTeams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTeam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_team_id")
	private long id;
	
	private String teamName;
	
	private float teamValue;

	@OneToOne(mappedBy = "userTeam")
	private User user;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "player_enrolled",
			joinColumns = @JoinColumn(name = "user_team_id"),
			inverseJoinColumns = @JoinColumn(name = "player_id")
			)
	private Set<Player> players = new HashSet<Player>();
	
}
