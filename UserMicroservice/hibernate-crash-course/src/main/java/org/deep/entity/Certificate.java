package org.deep.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {
    @Id
    private String certificateId;
    private String certificateName;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public Certificate(String certificateId,String certificateName) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;


    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
