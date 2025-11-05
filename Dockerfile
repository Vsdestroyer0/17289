FROM alpine
EXPOSE 80
RUN apk add nginx
COPY ./ordinario-ftw /var/lib/nginx/ordinario-FTW 
COPY ./rafael.conf /etc/nginx/http.d/default.conf

CMD ["nginx", "-g", "daemon off;"]
#-g "daemon off;"
