<!DOCTYPE html>
<html lang="en">
<head>
  <title>IMDB</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
     
    }
   .hero-image {
   background-image: url("data:image/jpeg;base64,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");
     background-repeat: no-repeat;
      background-size: cover;
      height: 250px;
   }
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

<div class="hero-image">
  <div class="container text-center" >
  
    <h1 style="font-size:100px;">IMDB</h1>      
    
    
  
</div>
</div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
<!--       <a class="navbar-brand" href="#">Logo</a>
 -->    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
     <!--   <li><a href="#">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="#">Contact</a></li> -->
      </ul>
      <!-- <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul> -->
    </div>
  </div>
</nav>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">NTR: Mahanayakudu</div>
        <div class="panel-body" ><a href="Movie1.jsp"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img2.jpg" class="img-responsive" style="width:100%,height:100px" alt="Image" ></a></div>
        <div class="panel-footer">Nandamuri Balakrishna, Vidya Balan, Rana Daggubati, Nandamuri Kalyanram, </div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Anjali CBI</div>
        <div class="panel-body"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img3.jpg" class="img-responsive" style="width:100%,height:100px" alt="Image"></div>
        <div class="panel-footer">Nayanthara, Atharvaa Murali, Anurag Kashyap, Raashi Khanna, Devan</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Lovers Day</div>
        <div class="panel-body"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img4.jpg" class="img-responsive" style="width:100%,height:100px" alt="Image" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Priya Prakash Varrier, Roshan Abdul Rahoof, Noorin Shereef</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Majili</div>
        <div class="panel-body"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img5.jpg" class="img-responsive" style="width:100%,height:100px" alt="Image"></div>
        <div class="panel-footer">Naga Chaitanya Akkineni, Samantha Ruth Prabhu</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">118</div>
        <div class="panel-body"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img6.jpg" class="img-responsive" style="width:100%,height:200px" alt="Image"></div>
        <div class="panel-footer">Nandamuri Kalyanram, Nivetha Thomas, Shalini</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Viswamitra</div>
        <div class="panel-body"><img src="C:\Users\sanadimp\Documents\workspace-sts-3.9.7.RELEASE\Imdb1\img\img7.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Sudev Nair, Devaki Rajendran</div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>


