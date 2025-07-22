(async function autoRemoveReposts() {
  console.log("▶️ Iniciando remoção automática de reposts...");

  let removidos = 0; // Contador

  while (true) {
    // Tenta encontrar o botão de remover repost
    const removeBtn = document.querySelector('a[aria-label="Remove repost"]');

    if (!removeBtn) {
      console.log(`✅ Nenhum botão de remover repost encontrado. Total removidos: ${removidos}`);
      break; // Sai do loop se não houver mais reposts
    }

    console.log("🔍 Botão de remover repost encontrado:", removeBtn);
    removeBtn.click();
    removidos++;
    console.log(`🗑️ Repost removido! Total até agora: ${removidos}`);

    // Espera 2 segundos pra ter certeza que foi removido
    // await new Promise(r => setTimeout(r, 1000));

    // Tenta achar o botão de próximo vídeo
    const nextBtn = document.querySelector('button[aria-label="Go to next video"]');
    if (nextBtn) {
      console.log("➡️ Indo para o próximo repost...");
      nextBtn.click();
    } else {
      console.log(`⚠️ Botão de próximo vídeo não encontrado. Total removidos: ${removidos}`);
      break;
    }

    // Espera 2 segundos para o próximo vídeo carregar
   // await new Promise(r => setTimeout(r, 2000));
  }

  console.log(`🏁 Fim do script. Total de reposts removidos: ${removidos}`);
})();
