
from telegram import Bot
from telegram.ext import Updater, CommandHandler, MessageHandler


bot = Bot(token='5507814342:AAHe9sfbIztfGlbakjOCsStpWCQueIlIl9Q')

Updater = Updater(token ='5507814342:AAHe9sfbIztfGlbakjOCsStpWCQueIlIl9Q')

dispatcher = updater.dispatcher

def start(update,context):
    context.bot.send_message(update.effective_chat.id,'lybly')


start_handler = CommandHandler('start', start)
dispatcher.add_handler(start_handler)

updater.start_polling()
updater.idle()