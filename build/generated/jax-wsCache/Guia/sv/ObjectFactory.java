
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Calculos_QNAME = new QName("http://sv/", "Calculos");
    private final static QName _CalculosResponse_QNAME = new QName("http://sv/", "CalculosResponse");
    private final static QName _Login_QNAME = new QName("http://sv/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://sv/", "LoginResponse");
    private final static QName _Operaciones_QNAME = new QName("http://sv/", "Operaciones");
    private final static QName _OperacionesResponse_QNAME = new QName("http://sv/", "OperacionesResponse");
    private final static QName _ProcesarPago_QNAME = new QName("http://sv/", "ProcesarPago");
    private final static QName _ProcesarPagoResponse_QNAME = new QName("http://sv/", "ProcesarPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculos }
     * 
     */
    public Calculos createCalculos() {
        return new Calculos();
    }

    /**
     * Create an instance of {@link CalculosResponse }
     * 
     */
    public CalculosResponse createCalculosResponse() {
        return new CalculosResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Operaciones }
     * 
     */
    public Operaciones createOperaciones() {
        return new Operaciones();
    }

    /**
     * Create an instance of {@link OperacionesResponse }
     * 
     */
    public OperacionesResponse createOperacionesResponse() {
        return new OperacionesResponse();
    }

    /**
     * Create an instance of {@link ProcesarPago }
     * 
     */
    public ProcesarPago createProcesarPago() {
        return new ProcesarPago();
    }

    /**
     * Create an instance of {@link ProcesarPagoResponse }
     * 
     */
    public ProcesarPagoResponse createProcesarPagoResponse() {
        return new ProcesarPagoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Calculos }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Calculos")
    public JAXBElement<Calculos> createCalculos(Calculos value) {
        return new JAXBElement<Calculos>(_Calculos_QNAME, Calculos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "CalculosResponse")
    public JAXBElement<CalculosResponse> createCalculosResponse(CalculosResponse value) {
        return new JAXBElement<CalculosResponse>(_CalculosResponse_QNAME, CalculosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operaciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Operaciones")
    public JAXBElement<Operaciones> createOperaciones(Operaciones value) {
        return new JAXBElement<Operaciones>(_Operaciones_QNAME, Operaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "OperacionesResponse")
    public JAXBElement<OperacionesResponse> createOperacionesResponse(OperacionesResponse value) {
        return new JAXBElement<OperacionesResponse>(_OperacionesResponse_QNAME, OperacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "ProcesarPago")
    public JAXBElement<ProcesarPago> createProcesarPago(ProcesarPago value) {
        return new JAXBElement<ProcesarPago>(_ProcesarPago_QNAME, ProcesarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "ProcesarPagoResponse")
    public JAXBElement<ProcesarPagoResponse> createProcesarPagoResponse(ProcesarPagoResponse value) {
        return new JAXBElement<ProcesarPagoResponse>(_ProcesarPagoResponse_QNAME, ProcesarPagoResponse.class, null, value);
    }

}
