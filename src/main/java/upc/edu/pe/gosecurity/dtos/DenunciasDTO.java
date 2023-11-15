package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.Ciudadano;
import upc.edu.pe.gosecurity.entities.Comisaria;
import upc.edu.pe.gosecurity.entities.DenunciasLugarHecho;
import upc.edu.pe.gosecurity.entities.DenunciasTipificacion;

import java.time.LocalDate;

public class DenunciasDTO {
    private int idDenuncias;
    private String nameDenuncias;
    private LocalDate fechaDenunciasHechos;
    private LocalDate fechaDenunciasRegistro;
    private LocalDate fechaDenunciasEmision;
    private DenunciasLugarHecho idDenunciasLugarHecho;
    private DenunciasTipificacion idDenunciasTipificacion;
    private Ciudadano idCiudadano;
    private Comisaria idComisaria;

    public int getIdDenuncias() {
        return idDenuncias;
    }

    public void setIdDenuncias(int idDenuncias) {
        this.idDenuncias = idDenuncias;
    }

    public String getNameDenuncias() {
        return nameDenuncias;
    }

    public void setNameDenuncias(String nameDenuncias) {
        this.nameDenuncias = nameDenuncias;
    }

    public LocalDate getFechaDenunciasHechos() {
        return fechaDenunciasHechos;
    }

    public void setFechaDenunciasHechos(LocalDate fechaDenunciasHechos) {
        this.fechaDenunciasHechos = fechaDenunciasHechos;
    }

    public LocalDate getFechaDenunciasRegistro() {
        return fechaDenunciasRegistro;
    }

    public void setFechaDenunciasRegistro(LocalDate fechaDenunciasRegistro) {
        this.fechaDenunciasRegistro = fechaDenunciasRegistro;
    }

    public LocalDate getFechaDenunciasEmision() {
        return fechaDenunciasEmision;
    }

    public void setFechaDenunciasEmision(LocalDate fechaDenunciasEmision) {
        this.fechaDenunciasEmision = fechaDenunciasEmision;
    }

    public DenunciasLugarHecho getIdDenunciasLugarHecho() {
        return idDenunciasLugarHecho;
    }

    public void setIdDenunciasLugarHecho(DenunciasLugarHecho idDenunciasLugarHecho) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
    }

    public DenunciasTipificacion getIdDenunciasTipificacion() {
        return idDenunciasTipificacion;
    }

    public void setIdDenunciasTipificacion(DenunciasTipificacion idDenunciasTipificacion) {
        this.idDenunciasTipificacion = idDenunciasTipificacion;
    }

    public Ciudadano getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Ciudadano idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public Comisaria getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(Comisaria idComisaria) {
        this.idComisaria = idComisaria;
    }
}
