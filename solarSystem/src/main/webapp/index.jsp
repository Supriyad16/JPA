<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
<h1>SOLAR SYSTEM</h1>
<form action="birth" method="post">


    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
    <div class="mb-3">
        <label for="name" class="form-label"><strong>Planet Name</strong></label>
        <input type="text" class="form-control" id="name" name="name" required>
    </div>

    <div class="mb-3">
        <label for="num" class="form-label"><strong>Planet Number</strong></label>
        <input type="number" class="form-control" id="num" name="num" required>
    </div>

    <div class="mb-3">
        <label for="colour" class="form-label"><strong>Planet Colour</strong></label>
        <input type="text" class="form-control" id="colour" name="colour" required>
    </div>

    <div class="d-flex justify-content-center">
        <button type="submit" class="btn btn-primary">Register</button>
    </div>
        </div>
    </div>
</form>
</body>
</html>

