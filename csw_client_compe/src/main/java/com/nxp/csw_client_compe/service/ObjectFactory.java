
package com.nxp.csw_client_compe.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nxp.csw_client_compe.service package. 
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

    private final static QName _GetAllById_QNAME = new QName("http://service.csw_compe.nxp.com/", "getAllById");
    private final static QName _SellProductResponse_QNAME = new QName("http://service.csw_compe.nxp.com/", "sellProductResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://service.csw_compe.nxp.com/", "addProductResponse");
    private final static QName _GetAllProductsResponse_QNAME = new QName("http://service.csw_compe.nxp.com/", "getAllProductsResponse");
    private final static QName _GetAllByIdResponse_QNAME = new QName("http://service.csw_compe.nxp.com/", "getAllByIdResponse");
    private final static QName _GetAllProducts_QNAME = new QName("http://service.csw_compe.nxp.com/", "getAllProducts");
    private final static QName _SellProduct_QNAME = new QName("http://service.csw_compe.nxp.com/", "sellProduct");
    private final static QName _AddProduct_QNAME = new QName("http://service.csw_compe.nxp.com/", "addProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nxp.csw_client_compe.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link SellProduct }
     * 
     */
    public SellProduct createSellProduct() {
        return new SellProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetAllById }
     * 
     */
    public GetAllById createGetAllById() {
        return new GetAllById();
    }

    /**
     * Create an instance of {@link SellProductResponse }
     * 
     */
    public SellProductResponse createSellProductResponse() {
        return new SellProductResponse();
    }

    /**
     * Create an instance of {@link GetAllByIdResponse }
     * 
     */
    public GetAllByIdResponse createGetAllByIdResponse() {
        return new GetAllByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "getAllById")
    public JAXBElement<GetAllById> createGetAllById(GetAllById value) {
        return new JAXBElement<GetAllById>(_GetAllById_QNAME, GetAllById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "sellProductResponse")
    public JAXBElement<SellProductResponse> createSellProductResponse(SellProductResponse value) {
        return new JAXBElement<SellProductResponse>(_SellProductResponse_QNAME, SellProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<GetAllProductsResponse>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "getAllByIdResponse")
    public JAXBElement<GetAllByIdResponse> createGetAllByIdResponse(GetAllByIdResponse value) {
        return new JAXBElement<GetAllByIdResponse>(_GetAllByIdResponse_QNAME, GetAllByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<GetAllProducts>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "sellProduct")
    public JAXBElement<SellProduct> createSellProduct(SellProduct value) {
        return new JAXBElement<SellProduct>(_SellProduct_QNAME, SellProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.csw_compe.nxp.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

}
