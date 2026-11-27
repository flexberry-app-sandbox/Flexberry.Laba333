package Laba333.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Laba333.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: СписокЗадач
 */
@Entity(name = "IISLaba333СписокЗадач")
@Table(schema = "public", name = "СписокЗадач")
public class SpisokZadach {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "название")
    private String название;

    @Column(name = "воЗадач")
    private Integer возадач;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "Zadacha")
    @Convert("Zadacha")
    @Column(name = "Задача", length = 16, unique = true, nullable = false)
    private UUID _zadachaid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "Zadacha", insertable = false, updatable = false)
    private Zadacha zadacha;


    public SpisokZadach() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getназвание() {
      return название;
    }

    public void setназвание(String название) {
      this.название = название;
    }

    public Integer getвоЗадач() {
      return возадач;
    }

    public void setвоЗадач(Integer возадач) {
      this.возадач = возадач;
    }


}