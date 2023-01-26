import requests
from bs4 import BeautifulSoup as bs
from urllib.parse import urlparse
website=input("Enter URL : ")
opera=1
def getlinks(website,bsobj):
    links=[]
    for links in bsobj.find_all('a',):
        if 'href' in links.attrs:
            links.append(urlparse(website,links.attrs['href']))
    return links
for i in range(50):
    url=website
    f=requests.get(url)
    directory="E:\\webscraping boootcamp\\"
    def scrapeURL(url, directory):
        bsobj=bs(f.content, "html.parser")
        name = str(bsobj.title)[7:][:-8]
        website=urlparse(url)[1]
        s=directory+name+'('+website+').html'
        with open(s, 'wb') as obj:
            obj.write(f.content)
        return True
        val=scrapeURL(url,directory)

