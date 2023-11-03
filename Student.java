package com.company;

public class Student
{
    private String nume;
    private float nota1;
    private float nota2;
    private float nota3;

    public Student(String nume, float nota1, float nota2, float nota3)
    {
        this.nume = nume;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNume()
    {
        return nume;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public float getNota1()
    {
        return nota1;
    }

    public void setNota1(float nota1)
    {
        if(nota1<1 || nota1>10)
            this.nota1=1;
        else
            this.nota1 = nota1;
    }

    public float getNota2()
    {
        return nota2;
    }

    public void setNota2(float nota2)
    {
        if(nota2<1 || nota2>10)
            this.nota2=1;
        else
            this.nota2 = nota2;
    }

    public float getNota3()
    {
        return nota3;
    }

    public void setNota3(float nota3)
    {
        if(nota3<1 || nota3>10)
            this.nota3=1;
        else
            this.nota3 = nota3;
    }

    public String toString()
    {
        return this.nume+": "+Float.toString(this.nota1)+", "+Float.toString(this.nota2)+", "+Float.toString(this.nota3);
    }
}
