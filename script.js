
var precio_produto=document.getElementById("_precio_producto").value,
    cantidad=document.getElementById("_cantidad").value;
var precio_p=parseInt(precio_produto);
var cant=parseInt(cantidad);
var importe_compra=precio_produto*cantidad,descuento_1=(importe_compra*0.10);
var descuento_2=(importe_compra-descuento_1)*0.10;
var descuento_total=descuento_1+descuento_2,importe_pagar=importe_compra-descuento_total;
function getImporte_compra()
{
    return precio_produto*cantidad;
}
function getProcesar()
{
    document.getElementById("resultado").value="El importe de compra es: "+getImporte_compra()+'\n';
    
    //vaciar cajas
    precio_produto.value="";
    cantidad.value="";
    precio_produto.focus();
    return false;
}