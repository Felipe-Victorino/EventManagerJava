package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registry")
public class Registry {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "participant_id")
	Participant participant;

	@ManyToOne
	@JoinColumn(name = "session_id")
	Session session;

	// Feedback feedback;


	public long getId() {return this.id;}
	public Participant getParticipant() {return this.participant;}
	public Session getSession() {return this.session;}

	public void setParticipant(Participant participant) {this.participant = participant;}
	public void setSession(Session session) {this.session = session;}
}