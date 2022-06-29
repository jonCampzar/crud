const producto = document.getElementById('product') ;


producto.addEventListener('submit', (e) => {
    e.preventDefault();
    const $nombre = producto.nombre.value;
    const $precio =producto.precio.value;
    console.log(producto);
    console.log($nombre);
    console.log($precio);

    fetch('/api/producto/all', {
        method: 'GET',
        headers: {
            "Content-Type": "text/plain"
        },
        
    })
    .then(data => {
        console.log('Hola' + data);
        console.log(data);
        //location.reload();
    })
    


    

})