<html><head>
  </head>
  	<title>Página de Login</title>
  <body>
    <div class="section section-danger text-justify">
      <div class="container">
        <div class="row text-center">
          <div class="col-md-12 text-center">
            <h1 class="text-center">Sistema de cadastro de Usuário</h1>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h3 class="tt_menu">&gt;&gt; VERIFICAÇÃO DE ACESSO &lt;&lt;</h3>
          </div>
        </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form">
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputEmail" class="control-label">Informar o Email:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="inputEmail" placeholder="email" title="Digite um email" required="required">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputNome" class="control-label">Informar a SENHA:</label>
                </div>
                <div class="col-sm-10">
                  <input type="password" class="form-control" id="inputSenha" placeholder="Senha" required="required">
                </div>
              </div>
                  <button type="submit" class="btn btn-danger">Login</button>
                  </form>
                </div>
              </div>
          </div>
          ${mensagem}  
</body></html>