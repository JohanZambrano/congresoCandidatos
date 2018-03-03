/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congresocandidatos;
/**
 *
 * @author Johan Zambrano
 */
public class Candidato {
    //Variables
        private String nombres;
        private String apellidos;
        private float numeroDocumento;
        private int edad;
        private float telefono;
        private String direccion;
        private String ciudadNac;
        private String partidoPolitico;
          
        Candidato(String _nombres, String _apellidos, float _numeroDocumento, int _edad, float _telefono, String _direccion, String _ciudadNac, String _partidoPolitico){
            this.nombres = _nombres;
            this.apellidos = _apellidos;
            this.numeroDocumento = _numeroDocumento;
            this.edad = _edad;
            this.telefono = _telefono;
            this.direccion = _direccion; 
            this.ciudadNac=_ciudadNac;
            this.partidoPolitico=_partidoPolitico;
        }
        
        public void setNombres(String _nombres){
            this.nombres = _nombres;
        }
        
        public void setApellidos(String _apellidos){
            this.apellidos = _apellidos;
        }
        
        public void setNumeroDocumento(float _numeroDocumento){
            this.numeroDocumento = _numeroDocumento;
        }
        
        public void setEdad(int _edad){
           this.edad = _edad;
        }
        
        public void setTelefono(float _telefono){
            this.telefono = _telefono;
        }
        
        public void setDireccion(String _direccion){
            this.direccion = _direccion;
        }
        
        public void setCiudadNac(String _ciudadNac){
            this.ciudadNac = _ciudadNac;
        }
        
        public String getNombres(){
            return this.nombres;
        }
        
        public String getApellidos(){
            return this.apellidos;
        }
        
        public float numeroDocumento(){
            return numeroDocumento;
        }
        
        public int getEdad(){
            return this.edad;
        }
        
        public float getTelefono(){
            return this.telefono;
        }
        
        public String getDireccion(){
            return this.direccion;
        }
        
        public String getCiudadNac(){
            return this.ciudadNac;
        }
        
        protected String datosCandidato(){
            String respuesta = "\nEl candidato: "+this.nombres+" "+this.apellidos; 
            respuesta+="\nNumero Documento: "+this.numeroDocumento;
            respuesta+="\nEdad: "+this.edad;
            respuesta+="\nTelefono: "+this.telefono;
            respuesta+="\nDireccion: "+this.direccion;        
            respuesta+="\nCiudad: "+this.ciudadNac;
            respuesta+="\nPartido político: "+this.partidoPolitico;
            return respuesta;
        }         
}

