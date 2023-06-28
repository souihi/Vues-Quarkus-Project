<template>
    <div class="airbnb--card">
        <div class="card">
            <div class="card-image">
                <figure class="image is-4by3">
                </figure>
            </div>
            <div class="card-content">
            <div class="media">
                <div class="media-left">
                    <figure  class="image is-48x48">
                    </figure>
                </div>
            <div class="media-content">
                <p class="title is-4">Nom</p>
                <p class="note"> Note</p>
            </div>
            </div>
            <div class="content">
                 Disponible 
                <br>
                <p class="price"> <strong>5</strong>€ la nuit</p>
            </div>
        </div>
    </div>
    </div>
</template>

<script>
//IMPORT
export default {
    name : "AirbnbCard",


}
</script>

<style lang="scss">
.airbnb--card{
    width: 25%;
    height: 30%;
    margin-left: 30px;
    margin-bottom: 50px;
    p{
        margin: 0;
    }
    .image.is-4by3 {
        background-image: url(https://a0.muscache.com/im/pictures/miso/Hosting-51809333/original/0da70267-d9da-4efb-9123-2714b651c9fd.jpeg?im_w=1200);
        padding-top: 75%;
        height: 100%;
        background-size: cover;
        background-position: center;
    }
    .image.is-48x48 {
        height: 48px;
        width: 48px;
        background-image: url(https://media2.ledevoir.com/images_galerie/nwd_101519_82956/image.jpg);
        background-size: cover;
        border-radius: 25px;
        left: -20px;
        background-position: center;
    }
    .media-content{
        margin: 5px 0px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        .note{
            height: 30px;
            width: 30px;
            background-color: #eee;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        
    }
}
</style>