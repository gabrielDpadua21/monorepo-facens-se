## Exercicio 1

### Código

```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500;700&display=swap" rel="stylesheet">
    <title>
        Catálogo de produtos
    </title>

    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Roboto', sans-serif;
        }

        .products_table .products {
            width: 100%
        }

        .products_table h1 {
            text-align: center;
        }

        .products_table .products img {
            max-width: 100px;
        }

        .products_table .products,
        .products_table .products th,
        .products_table .products td {
            border: 1px solid #000;
            text-align: center;
        }

        .product_infos {
            padding: 1rem
        }

        .product_infos h2,
        .product_infos h3 {
            text-align: center;
        }
    </style>
</head>

<body>
    <div class="products_table">
        <h1>Catálogo de produtos</h1>
        <table class="products">
            <thead>
                <tr>
                    <th scope="input"></th>
                    <th scope="image">Foto</th>
                    <th scope="code">Código</th>
                    <th scope="description">Descrição</th>
                    <th scope="quantity">Qtde em estoque</th>
                    <th scope="value">Valor unitário</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="checkbox" name="product_id" value="1" onclick="loadProduct(value)" />
                    </td>
                    <td>
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR28KORub_MSuDGEhq-67fum9TduyO3Z3dib1LL431u7DRhGxp-QdFEU7JI28zIindANCqEJoU&usqp=CAc"
                            alt="Mouse gamer 1">
                    </td>
                    <td>1</td>
                    <td>Red Dragon King Cobra</td>
                    <td>5</td>
                    <td>R$ 179,00</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" name="product_id" value="2" onclick="loadProduct(value)" />
                    </td>
                    <td>
                        <img src="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcTIuwFHbiVHaPVm_LG6upKLl21_XL84vYQmL7q5kICQFJgIDJjNBXkku0nE7lIkExevg3MOjmJqLOk&usqp=CAc"
                            alt="Mouse gamer 1">
                    </td>
                    <td>2</td>
                    <td>Mouse Gamer Razer Deathadder</td>
                    <td>10</td>
                    <td>R$ 379,00</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" name="product_id" value="3" onclick="loadProduct(value)" />
                    </td>
                    <td>
                        <img src="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSCHGv2ShpUA0XrH4Wb1PLlIWjyq1clMtyc7c7mWNNR7tkwu28rUitAdZEF75wCtLhuiqErFoR_VA&usqp=CAc"
                            alt="Mouse gamer 1">
                    </td>
                    <td>3</td>
                    <td>Mouse Gamer Logitech G403</td>
                    <td>5</td>
                    <td>R$ 139,00</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" name="product_id" value="4" onclick="loadProduct(value)" />
                    </td>
                    <td>
                        <img src="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcR0ZTt7_u9G_0UGnNe3xP1UJ_PCHqgd7xeQ4Wz5CZGnBeuleXnxONuf42yBDy_qyinbGP7hZGj-aA&usqp=CAc"
                            alt="Mouse gamer 1">
                    </td>
                    <td>4</td>
                    <td>Mouse Gamer Redragon Storm</td>
                    <td>2</td>
                    <td>R$ 179,00</td>
                </tr>
            <tbody>
        </table>
    </div>

    <div id="product_description" class="product_infos">
        <h2 id="description">
            Red Dragon King Cobra
        </h2>
        <h3>
            Caracteristicas do produtos
        </h3>
        <div class="info">
            <label for="infos">
                Especificações
            </label>
            <ul id="infos">
                <li>
                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti modi quisquam obcaecati iusto
                    sapiente sint, illo repellendus ut voluptas optio, consequatur esse porro ad impedit accusamus vero
                    tempore consectetur nostrum.
                </li>
                <li>
                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Enim dicta veritatis placeat non
                    architecto rem aperiam laborum? Nemo, aut similique iusto repudiandae, aspernatur quos neque
                    temporibus magni ducimus quaerat est!
                </li>
                <li>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores voluptatum ullam sunt quia
                    repellendus aliquid, quisquam laboriosam minus cum dolor corporis inventore amet saepe dolorem.
                    Obcaecati eos nobis doloremque quidem!
                </li>
            </ul>
        </div>
        <div class="rating">
            <h3>
                Avaliação do produto
            </h3>
            <div id="rantings">
                <dl>
                    <dt>José Aparecido</dt>
                    <dd>Muito bom</dd>
                </dl>
                <dl>
                    <dt>José da Silva</dt>
                    <dd>Bom</dd>
                </dl>
            </div>
        </div>
    </div>
</body>

</html>
```

### Página

![print](print.png)