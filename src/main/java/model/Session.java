package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.Room;
import java.util.Date;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.DATE)
    Date date;

    @OneToOne
    Room room;

    //LinkedList<Participants> participants

    public Session(){}

    public long getId(){return this.id;}
    public Date getDate(){return this.date;}
    public Room getRoom(){return this.room;}

    public void setDate(Date date){this.date = date;}
    public void setRoom(Room room){this.room = room;}


}