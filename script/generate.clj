#!/usr/bin/env bb

(ns generate
  (:require [babashka.pods :as pods]))

(pods/load-pod "bootleg")
(require '[pod.retrogradeorbit.bootleg.utils :as utils])

(def jumbotron
  [:div {:class "jumbotron"}
   [:p {:class "lead"} "Michiel Borkent"
    [:br]
    "Software developer, speaker, Clojure professional"]])

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
     [:li "Netherlands Chamber of Commerce / Kamer van Koophandel: 66357454"]]]])

(def cv
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"} "Curriculum vitae"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li [:a {:href "cv/cv-EN.pdf"} "Curriculum vitae (EN)"]]
     [:li [:img {:src "img/dutchflag_14px.jpg"}] " "
      [:a {:href "cv/cv.pdf"} "Curriculum vitae"]]]]])

(def open-source
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"}
     "Open source projects"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li
      [:a {:href "https://github.com/borkdude/babashka"}
       "Babashka"]
      [:span ": a fast scripting environment for Clojure"]]
     [:li
      [:a {:href "https://github.com/borkdude/clj-kondo"}
       "Clj-kondo"]
      [:span ": a linter for Clojure that sparks joy"]]
     [:li
      [:a {:href "https://github.com/borkdude/sci"}
       "Small Clojure Interpreter"]]
     [:li
      [:a {:href "https://github.com/borkdude/jet"}
       "Jet"]
      [:span ": CLI to transform between JSON, EDN and Transit"]]
     [:li
      [:a {:href "https://github.com/borkdude/edamame"}
       "Edamame"]
      [:span ": configurable EDN/Clojure parser with location metadata"]]
     [:li
      [:a {:href "https://github.com/borkdude/re-find"}
       "Re-find"]
      [:span ": find functions using spec"]]]]])

(def talks
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"} "Talks"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li "Babashka and the Small Clojure Interpreter: using Clojure in new contexts - "
      [:a {:href "https://www.youtube.com/watch?v=Nw8aN-nrdEk"} "video"]
      ", "
      [:a {:href
           "https://speakerdeck.com/borkdude/babashka-and-the-small-clojure-interpreter-at-clojured-2020"}
       "slides"]
      " and "
      [:a {:href "https://github.com/borkdude/babashka"} "code"]
      [:span {:class "text-muted"} " September 27th 2019, ClojuTRE"]]
     [:li "Clj-kondo: a linter for Clojure that sparks joy - "
      [:a {:href "https://www.youtube.com/watch?v=MB3vVREkI7s"} "video"]
      ", "
      [:a {:href
           "https://speakerdeck.com/borkdude/clj-kondo-a-linter-for-clojure-code-that-sparks-joy-at-clojutre-2019"}
       "slides"]
      [:a {:href "https://github.com/borkdude/clj-kondo"} "code"]
      [:span {:class "text-muted"} " September 27th 2019, ClojuTRE"]]
     [:li "Re-find: discover functions with spec - "
      [:a {:href "https://www.youtube.com/watch?v=Ygrml6tyrq0"} "video"]
      ", "
      [:a {:href "https://speakerdeck.com/borkdude/re-find-discover-functions-with-spec"}
       "slides"]
      " and "
      [:a {:href "https://borkdude.github.io/re-find.web/"} "demo"]
      [:span {:class "text-muted"} " April 6th 2019, Dutch Clojure Days"]]
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

(def writings
  [:div {:class "panel panel-default"}
   [:div {:class "panel-heading"}
    [:h3 {:class "panel-title"}
     "Writings"]]
   [:div {:class "panel-body"}
    [:ul {:class "list-unstyled"}
     [:li
      [:a {:href "//jaxenter.com/clojure-alternative-java-169315.html"}
       "Clojure: a mature alternative to Java"]]
     [:li
      [:img {:src "img/dutchflag_14px.jpg"}]
      " "
      [:a {:href "nljug/18_21_Clojure.pdf"}
       "Artikel in Java\nMagazine januari 2016"]]
     [:li
      [:a {:href "//blog.michielborkent.nl"}
       "Blog about\nClojure, Clojurescript and Datomic"]]]]])

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
      " - Music: "
      [:a {:href "https://www.michielborkent.nl/potmwebarchive/www.pictureofthemoon.net/media/mp3/ad"}
       "Ageless Day"]
      ", "
      [:a {:href "https://www.michielborkent.nl/potmwebarchive/www.pictureofthemoon.net/media/mp3/wc"}
       "Waxing Crescent"]]
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

(def github
  [:p {:class "text-right"}
   [:a {:href "//github.com/borkdude"}
    [:img {:src "//github.githubassets.com/images/modules/logos_page/GitHub-Mark.png",
           :width "25%"
           :alt "View Michiel Borkent's profile on Github"}]]])

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

(def body
  [:body
   [:div.container
    [:div.row
     [:div.col-md-8
      jumbotron
      business-info
      cv
      open-source
      talks
      writings
      courses
      etc]
     [:div.col-md-4
      avatar
      github
      stackoverflow
      #_linked-in
      twitter]]]])

(def head
  [:head "\n    "
   [:title "Welkom op de homepagina van Michiel Borkent"]
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
   [:link {:href "css/bootstrap.min.css", :rel "stylesheet"}]
   [:link {:href "css/lavish-bootstrap.css", :rel "stylesheet"}]])

(defn html []
  ["<!DOCTYPE html>\n"
   [:html head body]])

(let [index-edn (html)
      index-html (utils/convert-to index-edn :html)]
  (spit "index.html" index-html))
