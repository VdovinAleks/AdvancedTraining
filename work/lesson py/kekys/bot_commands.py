
'''
async def game(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None: 

    var = update.message.text
    bot_turn = randint(1,3)
    await update.message.reply_text(f'{bot_turn} - компуктер выбрал это {var}')
    if var==bot_turn:
     update.message.reply_text(f'Победила дружба)')
    if (var==1 and bot_turn==2) or (var==3 and bot_turn==1) or (var == 2 and bot_turn== 3):
     update.message.reply_text(f'Ура! Ты победил!!!')
    else: update.message.reply_text(f'Выиграл дурацкий компуктер(')

async def ex1(update: Update, context: ContextTypes.DEFAULT_TYPE,a) -> None:
    var =a
    bot_turn=randint(1,3)
    await update.message.reply_text(f'{bot_turn} {var}')
'''