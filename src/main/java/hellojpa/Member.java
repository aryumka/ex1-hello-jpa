package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@SequenceGenerator(name = "MEMBER_SEQ_GENERATOR", sequenceName = "MEMBER_SEQ", initialValue = 1, allocationSize = 50)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
//    @Column(name = "name")
    @Column(name = "name", nullable = false)
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


//    private Integer age;

//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//    @Temporal(TemporalType.TIMESTAMP) //자바 8 이상은 @Temporal 쓰면 됨
//    private Date createdDate;
//    private LocalDate createdDate; //date
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//    private LocalDateTime lastModifiedDate; //timestamp
//    @Lob
//    private String description;

//    @Transient //칼럼 아닌걸로 임시 필드
//    private int temp;

    public Member() {
    }

}
