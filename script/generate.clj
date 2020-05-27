#!/usr/bin/env bb

(ns generate
  (:require [babashka.pods :as pods]))

(pods/load-pod "bootleg")
(require '[pod.retrogradeorbit.bootleg.utils :as utils])

(def jumbotron
  [:div {:class "jumbotron"}
   [:p {:class "lead"} "Welcome to my home page! "
    [:br]
    "My name is Michiel Borkent. Software developer and Clojure professional."]
   [:p {:class "text-muted"} "Welkom op mijn homepagina! "
    [:br]
    "Ik ben Michiel Borkent. Software-ontwikkelaar en Clojure professional."]])

(def business-info
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"} "Business info"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li "Michiel Borkent - Clojure development"]
     [:br]
     [:li [:a {:href "mailto:michielborkent@gmail.com"} "michielborkent@gmail.com"]]
     [:br]
     [:li "Chamber of Commerce / Kamer van Koophandel: 66357454"]]]])

(def cv
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"} "Curriculum vitae"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li [:a {:href "cv/cv-EN.pdf"} "Curriculum vitae (EN)"]
      [:span {:class "text-muted"} " (10-2016)"]]
     [:li [:img {:src "img/dutchflag_14px.jpg"}] " "
      [:a {:href "cv/cv.pdf"} "Curriculum vitae"]
      [:span {:class "text-muted"} " (10-2016)"]]]]])

(def talks-workshops
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"} "Talks and workshops"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li "Functional Programming in Practice - "
      [:a {:href "https://github.com/borkdude/fp-hu-may-2016"} "repo and slides"]
      [:span {:class "text-muted"} " May 9th 2016, Hogeschool Utrecht"]]
     [:li "Full stack Clojure - "
      [:a {:href "https://github.com/borkdude/full-stack-clojure-han-okt-2015"}
       "repo and slides"]
      [:span {:class "text-muted"} " October 1 2015, Hogeschool Arnhem-Nijmegen"]]
     [:li "Functional programming in the browser with ClojureScript - "
      [:a {:href "https://github.com/borkdude/sytac-core-async"} "repo and slides"]
      [:span {:class "text-muted"} " July 29 2015, "
       [:a {:href "http://www.meetup.com/Sytac-Dev-Jam/events/223330464/"} "Sytac Devjam"]]]
     [:li "ClojureScript &lt;3 React - "
      [:a {:href "http://domcode.org/videos/2015/05/26/clojurescript-and-reactjs/"} "video"] ", "
      [:a {:href "slides/domcode-may-26-2015.pdf"} "slides"] " and "
      [:a {:href "https://github.com/borkdude/domcode-cljs-react"} "code"]
      [:span {:class "text-muted"} " May 26 2015, "
       [:a {:href "http://www.meetup.com/DomCode/events/222548762/"} "DomCode meetup"]]]
     [:li "Reagent - ClojureScript interface to React - "
      [:a {:href "slides/react-amsterdam-feb-12-2015.pdf"} "slides"] " and "
      [:a {:href "https://github.com/borkdude/react-amsterdam"} "code"]
      [:span {:class "text-muted"} " Feb. 12 2015, "
       [:a {:href "http://www.meetup.com/React-Amsterdam/events/220160608/"} "React Amsterdam"]]]
     [:li "ClojureScript interfaces to React - "
      [:a {:href "http://vimeo.com/111289716"} "video"] ", "
      [:a {:href "oredev14/ClojureScript_interfaces_to_React.pdf"} "slides"]
      " and "
      [:a {:href "https://github.com/borkdude/oredev2014"} "code"] " "
      [:span {:class "text-muted"} " Nov. 6 2014, "
       [:a {:href "http://oredev.org/2014/speakers/michiel-borkent"} "Øredev"] ", Malmö Sweden"]]
     [:li "ClojureScript for the web - "
      [:a {:href "http://vimeo.com/111214648"} "video"] ", "
      [:a {:href "oredev14/ClojureScript_for_the_web.pdf"} "slides and "]
      [:a {:href "https://github.com/borkdude/oredev2014"} "code"] " "
      [:span {:class "text-muted"} " Nov. 6 2014, "
       [:a {:href "http://oredev.org/2014/speakers/michiel-borkent"} "Øredev"] ", Malmö Sweden"]]
     [:li "ClojureScript/Om/Reagent - "
      [:a {:href "http://vimeo.com/109915707"} "video"] " and "
      [:a {:href "fpamsclj/fpamsclj.pdf"} " slides "]
      [:span {:class "text-muted"} "Oct. 16 2014, FP AMS, Amsterdam Netherlands"]]
     [:li "Immutable Stack (clojure workshop) - "
      [:a {:href "devnology-immutable-stack-04-10-2014/presentation.html"} "slides"]
      " and "
      [:a {:href "https://github.com/borkdude/immutable-webapp"} "code "]
      [:span {:class "text-muted"} "Oct. 10 2014, Devnology, Leusden Netherlands\n"]]
     [:li [:img {:src "img/dutchflag_14px.jpg"}] " Clojure introductie - "
      [:a {:href "gastcollege-han-28-05-2014/presentation.html"} "slides "]
      [:span {:class "text-muted"}
       "Jun. 20 2013, Dec. 19 2013, May 5 2014, Hogeschool Arnhem-Nijmegen Netherlands"]]]]])

(def clojure
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"}
     "Clojure"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "nljug/18_21_Clojure.pdf"}
       "Artikel in Java\nMagazine januari 2016"]]
     [:li
      [:a {:href "//blog.michielborkent.nl"}
       "Blog about\nClojure, Clojurescript and Datomic"]]
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "clojurecursus/index.html"}
       "Clojure\nlesmateriaal"]
      " "
      [:span {:class "text-muted"}
       "(2012-2013)"]]
     [:li "Examples, snippets, toy apps:"
      [:ul
       [:li
        [:a {:href "https://github.com/borkdude/michielborkent.nl"}
         "Babashka / bootleg source of this website."]]
       [:li
        [:a {:href "https://github.com/borkdude/immutable-webapp"}
         "Immutable Webapp"] "- app with Reagent front end and Liberator + Datomic backend"]
       [:li
        [:a {:href "//twitter.michielborkent.nl"}
         "Who follows me?"] "(source"
        [:a {:href "https://github.com/borkdude/who-follows-me"}
         "here)"]]
       [:li
        [:a {:href "http://tictactoe.michielborkent.nl"}
         "TicTacToe"] "(source"
        [:a {:href "https://github.com/borkdude/tictactoe"}
         "here)"]]
       [:li
        [:a {:href "//michielborkent.nl/tictactoe-cljs"}
         "TicTacToe\nin ClojureScript and Om"] "(source"
        [:a {:href "https://github.com/borkdude/tictactoe-cljs"}
         "here)"]]
       [:li
        [:a {:href "//michielborkent.nl/reagent-drag/"}
         "Draggable Button in Reagent"] "(source"
        [:a {:href "https://github.com/borkdude/draggable-button-in-reagent"}
         "here"] ")"]]]]]])

(def courses
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"}
     "Courses"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "clojurecursus/index.html"}
       "Clojure\nlesmateriaal"]
      " "
      [:span {:class "text-muted"}
       "(2012-2013)"]]
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "downloads/dotnet-public.zip"}
       "Lesmateriaal\nC# / .NET programmeren"]
      " "
      [:span {:class "text-muted"}
       "(2011-2013)"]]]]])

(def etc
  [:div
   {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"}
     "Etc."]
    ]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "https://www.facebook.com/groups/tssnl"}
       "The\nStarch Solution Nederland community"]
      " "
      [:span {:class "text-muted"}
       "(&gt; 2 Aug. 2014)"]
      ]
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "//www.eetvoorjeleven.nu"}
       "Mijn blog\nover gezond eten"]
      [:span {:class "text-muted"}
       "(&gt; Aug. 2013)"]
      ]
     [:li
      [:a {:href "//www.michielborkent.nl/potmwebarchive/index.html"}
       "Website\nof my old band Picture of the Moon"]
      " "
      [:span {:class "text-muted"}
       "(2001-2008)"]
      ]
     [:li
      [:a {:href "mmm/finalthesis.pdf"}
       "Final Thesis Music\nMind Machine"] ","
      [:a {:href "mmm/presentatie.pdf"}
       "slides"] " and "
      [:a {:href "mmm/drempdemo.html"}
       "demo"]
      " "
      [:span {:class "text-muted"}
       "(2005)"]
      ]
     [:li
      [:a {:href "mmm/stageverslag.pdf"}
       "Internship report Music\nMind Machine"] ", "
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "mmm/presentatie-stage.pdf"}
       "presentatie"] " and "
      [:a {:href "mmm/tutorial.html"}
       "tutorial"]
      " "
      [:span {:class "text-muted"}
       "(2005)"]]]]])

(def avatar
  [:p
   [:img {:class "img-responsive",
          :src "img/avatar-zwart-wit.jpg",
          :alt "Michiel"}]])

(def stackoverflow
  [:p {:class "text-right"}
   [:a {:href "//stackoverflow.com/users/6264/michiel-borkent"}
    [:img
     {:src "//stackoverflow.com/users/flair/6264.png",
      :width "208",
      :height "58",
      :alt "Stackoverflow",
      :title "profile for Michiel Borkent at Stack Overflow, Q&A for professional and enthusiast programmers"}]]])

(def linked-in
  [:p {:class "text-right"}
   [:a {:href "//nl.linkedin.com/in/michielborkent"}
    [:img {:src "//www.linkedin.com/img/webpromo/btn_myprofile_160x33.png",
           :width "160", :height "33",
           :border "0", :alt "View Michiel Borkent's profile on LinkedIn"}]]])

(def twitter
  [:p {:class "text-right"}
   [:a {:href "https://twitter.com/borkdude",
        :class "twitter-follow-button",
        :data-show-count "false",
        :data-width "208px",
        :data-size "large",
        :data-align "right"} "Follow @borkdude"]
   [:script {:type "text/javascript"} "
  window.twttr = (function(d, s, id) {
      var t, js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id))
      return;
      js = d.createElement(s);
      js.id = id;
      js.src = \"https://platform.twitter.com/widgets.js\";
      fjs.parentNode.insertBefore(js, fjs);
      return window.twttr || (t = {
      _e : [],
      ready : function(f) {\n      t._e.push(f)
      }
      });
      }(document, \"script\", \"twitter-wjs\"));"]])

(defn body []
  [:body
   [:div.container
    [:div.row
     [:div.col-md-8
      jumbotron
      business-info
      cv
      talks-workshops
      clojure
      courses
      etc]
     [:div.col-md-4
      avatar
      stackoverflow
      linked-in
      twitter]]]])

(def head
  [:head "\n    "
   [:title "Welkom op de homepagina van Michiel Borkent"]
   [:meta {:charset "utf-8"}]
   [:link {:href "css/bootstrap.min.css", :rel "stylesheet"}]
   [:link {:href "css/lavish-bootstrap.css", :rel "stylesheet"}]])

(defn html []
  ["<!DOCTYPE html>\n"
   [:html head
    (body)]])

(let [index-edn (html)
      index-html (utils/convert-to index-edn :html)]
  (spit "index.html" index-html))
