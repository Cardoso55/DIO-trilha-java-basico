classDiagram
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet
    Iphone --|> ReprodutorMusical
    class AparelhoTelefonico{
    
      +iniciarCorreioVoz() void
      +atender() void
      +Ligar(String: numero) void
    }
    class NavegadorInternet{
      
      +abrirNovaAba() void
      +atualizarPagina() void
      +exibirPagina(String: url) void
    }
    class ReprodutorMusical{
      
      +tocar() void
      +pausar() void
      +escolherMusica(String: musica) void
      
    }
