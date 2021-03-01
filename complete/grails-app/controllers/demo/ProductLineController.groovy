package demo


import grails.rest.*
import grails.converters.*

class ProductLineController extends RestfulController<ProductLine> {
	static responseFormats = ['json', 'xml']
    ProductLineController() {
        super(ProductLine)
    }
}
