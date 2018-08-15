package com.company.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "target_audiance")
public class TargetAudiance implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	private Platform platform;

	@ElementCollection
	@CollectionTable(name = "languages")
	@Column(name = "language")
	private Set<String> languages;

	@ElementCollection
	@CollectionTable(name = "genders")
	@Column(name = "gender")
	private List<String> genders;

	@ElementCollection
	@CollectionTable(name = "age_range")
	@Column(name = "age_range")
	private List<String> ageRange;

	@ElementCollection
	@CollectionTable(name = "locations")
	@Column(name = "location")
	private List<String> locations;

	@ElementCollection
	@CollectionTable(name = "interests")
	@Column(name = "interest")
	private List<String> interests;

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}

	public List<String> getGenders() {
		return genders;
	}

	public void setGenders(List<String> genders) {
		this.genders = genders;
	}

	public List<String> getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(List<String> ageRange) {
		this.ageRange = ageRange;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

}