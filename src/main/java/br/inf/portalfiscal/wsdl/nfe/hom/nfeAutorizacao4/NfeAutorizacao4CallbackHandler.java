/**
 * NfeAutorizacao4CallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package br.inf.portalfiscal.wsdl.nfe.hom.nfeAutorizacao4;


/**
 *  NfeAutorizacao4CallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class NfeAutorizacao4CallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public NfeAutorizacao4CallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public NfeAutorizacao4CallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for nfeAutorizacaoLote method
     * override this method for handling normal response from nfeAutorizacaoLote operation
     */
    public void receiveResultnfeAutorizacaoLote(
            br.inf.portalfiscal.wsdl.nfe.hom.nfeAutorizacao4.NfeAutorizacao4Stub.NfeResultMsg result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from nfeAutorizacaoLote operation
     */
    public void receiveErrornfeAutorizacaoLote(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for nfeAutorizacaoLoteZip method
     * override this method for handling normal response from nfeAutorizacaoLoteZip operation
     */
    public void receiveResultnfeAutorizacaoLoteZip(
            br.inf.portalfiscal.wsdl.nfe.hom.nfeAutorizacao4.NfeAutorizacao4Stub.NfeResultMsg result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from nfeAutorizacaoLoteZip operation
     */
    public void receiveErrornfeAutorizacaoLoteZip(java.lang.Exception e) {
    }
}
