package Laba333.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Laba333.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: Задача
 */
@Entity(name = "IISLaba333Задача")
@Table(schema = "public", name = "Задача")
public class Zadacha {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "id")
    private Integer id;

    @Column(name = "название")
    private String название;

    @Column(name = "описание")
    private String описание;

    @Column(name = "статус")
    private String статус;


    public Zadacha() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Integer getid() {
      return id;
    }

    public void setid(Integer id) {
      this.id = id;
    }

    public String getназвание() {
      return название;
    }

    public void setназвание(String название) {
      this.название = название;
    }

    public String getописание() {
      return описание;
    }

    public void setописание(String описание) {
      this.описание = описание;
    }

    public String getстатус() {
      return статус;
    }

    public void setстатус(String статус) {
      this.статус = статус;
    }


}